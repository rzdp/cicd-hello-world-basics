pipeline {

    agent any

    stages {

        stage("build") {
            steps {
                echo 'Cleaning the dev application..'
                echo 'Building the dev application..'
            }
        }

        stage("test") {
            steps {
                echo 'Testing the dev application..'
            }
        }

        stage("deploy") {
            steps {
                echo 'Deploying the dev application..'
            }
        }
    }
}
