# Capstone Project Bangkit C23-PS409
![logo2](https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/935f9b3f-cab3-4833-bf51-ee73d95e31b3)

Hening - Understanding The Meaning
--
An application that can learn and translate sign language into Indonesian to facilitate communication between deaf people and those who can hear.

Our Capstone Project Team Member
--

| Member Name | Bangkit Id    | Path    |
| :---:   | :---: | :---: |
| Marcella Aurelia Yatijan | M132DSY0350   | Machine Learning   |
| Alfredi Yoani | M132DSX0451   | Machine Learning   |
| Masita Dewi Cahyani | C295DSY2369   | Cloud Computing   |
| Hubert Igor Haryatmo Tandri | C360DSX3529   | Cloud Computing   |
| Mahendra Adi Rahmawan | A360DSX2747   | Mobile Development   |
| Ahmad Dani Alifiansyah | A132DSX1158   | Mobile Development   |

Our Tools that We Use
--
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/df9ba3d2-1f03-47af-a8c4-30209888408a" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/b593fb96-6c66-4f25-a629-f604b47b1c70" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/8b4d995c-3dae-426a-afa7-220569106e68" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/cb8d2e80-fb29-44f1-9ef1-16932ebab174" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/3816fbfc-459b-4fc0-a284-caf096ab7c49" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/540d9be8-876f-43fe-824f-dfca75e4fdf4" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/1c016dae-5066-4c3c-a4dd-17a1b055bf45" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/604cda03-e462-4dda-b275-e505494e7a5d" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/d9b42313-2396-4233-ad4a-a6ed08a9b01c" width="300">
<img src="https://github.com/mahendra581/BANGKIT-2023-HENING/assets/125616401/a64217f0-287b-4032-a228-a44d6960efda" width="300">

### Machine Learning
We created machine learning that is used to detect and clasify 26 BISINDO's Alphabet from A to Z.
The result also showing the accuracy
### Cloud Computing
In Cloud Computing, we created two APIs. First one is API about articles and courses. The second one is API for login and sign up user. The tools and infrastructure that we used:

- Express JS
- Google Cloud Platform
- Google Cloud Storage
- Google Cloud SQL
- Google App Engine
### Mobile Development
In Mobile Development, we created some features for this project:
- Feature camera to detect sign language
- Feature course (paid)
- Feature article
- Carousel
- Profile

Library that We Used
--
Development in Machine Learning, you need that to import:

```
tensorflow
numpy
protobuf
```

Development in Cloud Computing, you need this environment:

```
ExpressJS
Google Cloud Platform
App Engine
Cloud Storage
Cloud SQL
```

Development in Mobile Development, you need that to import:

```
Android studio
Figma
Kotlin
Retrifit
Camera
MVVM Architecture
```

For the step from Machine Learning model to deployment tensorflow. We convert the machine learning model into tf.lite . After that, we insert it to Android Studio:
```
# cloning project branch Machine Learning for the tf.lite file
$ git clone -b ML https://github.com/mahendra581/BANGKIT-2023-HENING.git
```

For the step API:
```
# open text editor and cloud shell in Google Cloud Platform
# cloning project branch Cloud Computing
$ git clone -b CC https://github.com/mahendra581/BANGKIT-2023-HENING.git
# move to directory
$ cd BANGKIT-2023-HENING
# deploy with App Engine
$ gcloud app deploy
# check the endpoint
$ gcloud app browse
```

Dataset
--
- Link Google Drive: https://drive.google.com/drive/folders/1VIVTJuMBk5AxqKKVTcbByj5GWnf1fHmd?usp=sharing 
- Link Roboflow: https://app.roboflow.com/bangkit-capstone-c23ps409/bisindo-yxbnh/1
