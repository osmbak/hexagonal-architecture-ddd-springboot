pipeline {
    agent any

    environment {
        KUBECONFIG = '/var/jenkins_home/.kube/config' // chemin vers kubeconfig
        IMAGE_NAME = 'spring-app:latest'
        NAMESPACE = 'default'
    }

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/osmbak/spring-boot-jpa-h2.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package -DskipTests'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh 'docker build -t $IMAGE_NAME .'
            }
        }

        stage('Push Docker Image') {
            steps {
                sh '''
                    docker push $IMAGE_NAME
                '''
            }
        }

        stage('Deploy to Kubernetes') {
            steps {
                sh '''
                    kubectl set image deployment/spring-app-deploy spring-app=$IMAGE_NAME -n $NAMESPACE
                    kubectl rollout status deployment/spring-app-deploy -n $NAMESPACE
                '''
            }
        }
    }
}
