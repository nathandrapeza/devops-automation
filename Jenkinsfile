pipeline {
    agent any
    tools {
        maven '3.8.7'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/nathandrapeza/devops-automation']])
                sh 'mvn clean install'
            }
        }
        stage('Build Docker Image') {
            steps {
                //sh 'docker --version'
                sh 'docker build -t drapeza/devops-integration .'
            }
        }
        stage("Push Docker image to Docker Hub") {
            steps {
                withCredentials([string(credentialsId: 'dockerhub-pwd', variable: 'dockerhubpwd')]) {
                // login to docker
                sh 'docker login -u drapeza -p ${dockerhubpwd}'
                }
                sh 'docker push drapeza/devops-integration'
            }
        }
    }
}