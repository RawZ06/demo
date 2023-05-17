pipeline {
    agent any
    tools {
        maven 'mvn'
    }
    stages {
        stage('Build') {
            steps {
                sh 'docker-compose build'
            }
        }
    }
}