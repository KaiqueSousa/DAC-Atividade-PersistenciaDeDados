docker build -t dac-persist/postgres ./postgres  
docker run -d -p 5433:5432 --name postgres -d dac-persist/postgres

mvn clean package                      

chmod -R 777 ./target
docker build -t dac-persist/app .         
docker run -d -p 8080:8080 --name app --link postgres:host-container dac-persist/app
docker logs -f app
docker logs -f postgres








