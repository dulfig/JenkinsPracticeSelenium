pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo 'Building...'
                bat 'mvn clean package'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
        stage('Test') { 
            steps {
                echo 'Testing...'
                bat 'mvn test -B'
                junit '**/target/*.xml' 
            }
        }
        stage('Deploy') { 
            steps {
                echo 'Deploying...'
            }
        }
    }
}