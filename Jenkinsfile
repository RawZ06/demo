pipeline {
    agent any
    tools {
        Docker 'docker'
    }
    stages {
        stage('Build') {
            steps {
                sh 'docker-compose build'
            }
        }
    }
}