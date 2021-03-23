pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                echo 'Building...'
                bat 'mvn clean package -DskipTests'
                archiveArtifacts artifacts: '**/target/*.jar'
            }
        }
        stage('Test') { 
            steps {
                echo 'Testing...'
                bat 'mvn test -B'
                bat 'make check || true'
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