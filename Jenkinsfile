pipeline {

    agent any

    stages {

        stage("Clean Application") {
            steps {
                echo 'Cleaning dev application..'
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn clean'
                }
            }
        }
        
        stage("Building & Testing Application") {
            steps {
                echo 'Building and testing dev application..'
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn package'
                }
            }
        }

        stage("Create Image") {
            steps {
                echo 'Creating docker image..'
                bat 'docker build -t rzdp97/cicd-hello-world-basics:0.0.1-SNAPSHOT .'
            }
        }

        stage("Push Image") {
            steps {
                echo 'Pushing docker image..'
                bat 'docker push rzdp97/cicd-hello-world-basics:0.0.1-SNAPSHOT'
            }
        }
    }
}
