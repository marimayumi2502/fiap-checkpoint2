# fiap-checkpoint2

#Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "dev"

docker run -d \
-e MYSQL_ROOT_PASSWORD= root_pwd \
-e MSQL USER= new user \
-e MYSQL_PASSWORD=my_pwd\
-p 3306:3306 \
mysql


#Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "prd"

docker run -p 8080:8080 \
-e SPRING_PROFILES_ACTIVE=prd \
-e DATABASE_URL=jdbc:oracle:thin:@//host-do-banco:porta-do-banco/sid \
-e DATABASE_USERNAME=new user \
-e DATABASE_PASSWORD=my_pwd \



#Comando "docker" para executar a aplicação a partir do docker hub do respectivo membro com profile "stg"

docker run -p 8080:8080 \
-e SPRING_PROFILES_ACTIVE=prd \
-e DATABASE_URL=jdbc:oracle:thin:@//host-do-banco:porta-do-banco/sid \
-e DATABASE_USERNAME=new user \
-e DATABASE_PASSWORD=my_pwd
