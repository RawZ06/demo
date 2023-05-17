pipeline {
    agent any
    tools {
        docker 'docker'
    }
    stages {
        stage('Build') {
            steps {
                sh 'docker-compose build'
            }
        }
    }
}