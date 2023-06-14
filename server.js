const express = require('express');
const userHandler = require('./controller/users');

const bodyParser = require('body-parser');
const session = require('express-session');
const database = require('./config/database');

const app = express();
const port = 8080;

app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());

app.use(session({
    secret: 'secret',
    resave: true,
    saveUninitialized: true
}));

app.use(function(req, res, next) {
    res.header("Access-Control-Allow-Origin", "*");
    res.header("Access-Control-Allow-Headers", "Origin, X-Requested-With, Content-Type, Accept");
    next();
});

// Define your API endpoints using the router
app.get('/', (req, res) => {
    const response = {
        message: 'Hello from the API!'
    };
    res.json(response);
});


app.post('/api/register', userHandler.registerEmail);
app.post('/api/login', userHandler.loginEmail);


// const port = process.env.PORT;

app.listen(port, () => {
    console.log(`Server is running on port ${port}`);
});