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
    env
    echo $BRANCH_NAME
    git status
    '''
}
