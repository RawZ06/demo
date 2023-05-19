pipeline {
    agent {
        docker {
            image 'maven:3.8.3-openjdk-17'
            network 'devops'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('SonarQube analysis') {
            steps {
                sh "mvn clean verify sonar:sonar -Dsonar.projectKey=demo -Dsonar.projectName='demo' -Dsonar.host.url=http://sonarqube:9000 -Dsonar.token=sqp_09e2e0a6c8cbdcf8df17b85363dee60b12b52e7b"
            }
        }
    }
}