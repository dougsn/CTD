echo "docker-compose down"
docker-compose down
echo "docker-compose rm -f"
docker-compose rm -f

echo "build"
cd eureka
mvn clean package -DskipTests
cd ..
cd config
mvn clean package -DskipTests
cd ..
cd gateway
mvn clean package -DskipTests
cd ..

echo "docker-compose build"
docker-compose build

echo "docker-compose up"
docker-compose up