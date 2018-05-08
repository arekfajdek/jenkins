pipeline {
    agent any

    stages {
        stage ('Compile stage') {
            setps {
                withMaven(maven: 'LOCAL_MAVEN') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Test stage') {
            setps {
                withMaven(maven: 'LOCAL_MAVEN') {
                    sh 'mvn test'
                }
            }
        }
    }
}