pipeline {
    agent any
    stages {
        stage('SriRamajeyam')
        {
            steps {
                echo "Sri Ramajeyam..! Hello World..!"
            }
        }
        stage ('First Stage') {
            steps{
                echo "Step 1. Hello World..!"
            }
        }
        stage ('Second Stage') {
            steps{
                echo "Step 2. Second time Hello..!"
                echo "Step 3. Third time Hello...!"
            }
        }
        
    }
}