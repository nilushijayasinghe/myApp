pipeline {
    agent any

    stages{
        stage('Compile Stage'){
            steps {
                sh "mvn clean"
                }
            }

            steps {
            withMaven(maven : 'maven 3_6_3'){
                sh 'mvn clean compile'
             }
        }
    }

            stage('Testing stage'){
                steps {
                    withMaven(maven : 'maven 3_6_3'){
                                    sh 'mvn test'
                    }
                }
            }

            stage ('Deployment stage')
                steps{
                withMaven(maven : 'maven 3_6_3'){
                    sh 'mvn deploy'
                    }
                }

            }



        }
