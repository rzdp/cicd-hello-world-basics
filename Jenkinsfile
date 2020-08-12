pipeline {

    environment {
        registry = 'rzdp97/cicd-hello-world-basics'
        registryTag = '0.0.1-SNAPSHOT'
        registryCredential = 'DOCKER_CREDENTIALS'
        dockerImage = ''
    }

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
        
        stage("Build & Test Application") {
            steps {
                echo 'Building and testing dev application..'
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn package'
                }
            }
        }

        stage("Create Docker Image") {
            steps {
                echo 'Creating docker image..'
                script {
                    dockerImage = docker.build registry + ':' + registryTag
                }
            }
        }

        stage("Push Docker Image") {
            steps {
                echo 'Pushing docker image..'
                script {
                    docker.withRegistry('', registryCredential) {
                        dockerImage.push()
                    }
                }
            }
        }
    }
}
