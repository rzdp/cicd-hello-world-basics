pipeline {

    agent any

    stages {

        stage("Clean Application") {
            steps {
                echo 'Cleaning the dev application..'
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn clean'
                }
            }
        }
        
        stage("Build Application") {
            steps {
                echo 'Building the dev application..'
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn package'
                }
            }
        }
        
        stage("Test Application") {
            steps {
                echo 'Testing the dev application..'
                withMaven(maven : 'apache-maven-3.6.3') {
                    bat 'mvn test'
                }
            }
        }

        stage("deploy") {
            steps {
                echo 'Deploying the dev application..'
                bat 'cd target'
                bat 'java -jar cicd-hello-world-basics-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}
