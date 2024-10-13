def call(String GitUrl, String GitBranch){
  echo "Cloning the repo"
  git url: "${GitUrl}", branch: "${GitBranch}"
  echo "Repo clone successful"
}
