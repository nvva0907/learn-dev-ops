call mvn clean install
call cd /
call cd LEANING
call docker-compose build
call docker push nvva0907/learning-devops:latest