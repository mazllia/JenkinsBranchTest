pipeline {
    agent { label "KKBOXSecondaryBuilder" }
    stages {
        stage('Init') {
          steps { CheckoutSCM() }
        }
    }
}

def CheckoutSCM() {
    sh '''
    echo ${BRANCH_NAME}
    git status
    '''
}
