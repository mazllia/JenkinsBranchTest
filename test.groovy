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
    echo $GIT_BRANCH
    git status
    '''
    git branch: $GIT_BRANCH, url: 'git@github.com:mazllia/JenkinsBranchTest.git'
    sh '''
    git status
    '''
}
