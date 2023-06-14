import numpy as np
import os
import glob
import PIL.Image

from tflite_model_maker.config import ExportFormat
from tflite_model_maker import model_spec
from tflite_model_maker import object_detector

import tensorflow as tf
assert tf.__version__.startswith('2')

tf.get_logger().setLevel('ERROR')
from absl import logging
logging.set_verbosity(logging.ERROR)

spec = model_spec.get('efficientdet_lite2')

train_data = object_detector.DataLoader.from_pascal_voc("/content/drive/MyDrive/capstone/train/train", "/content/drive/MyDrive/capstone/train/train", ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y","Z"])

test_data = object_detector.DataLoader.from_pascal_voc('/content/drive/MyDrive/capstone/test/test', '/content/drive/MyDrive/capstone/test/test', ["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X","Y","Z"])


model = object_detector.create(train_data, model_spec=spec, batch_size=24, epochs=60, train_whole_model=True, validation_data=test_data)

model.evaluate(test_data)

model.export(export_dir='/content/model')