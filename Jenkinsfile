pipeline {
    agent any
    stages {
        stage ('Compile stage') {
            steps {
                withMaven(maven: 'LOCAL_MAVEN') {
                    sh 'mvn clean compile'
                }
            }
        }

        stage ('Test stage') {
            steps {
                withMaven(maven: 'LOCAL_MAVEN') {
                    sh 'mvn test'
                }
            }
        }
    }
}