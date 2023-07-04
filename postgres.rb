Postgresql Instalation
sudo apt-get install postgresql-12
sudo apt-get install libpq-dev
sudo -u postgres psql

Creating a Database
create database agenda_rails_api_development
alter user postgres with encrypted password 'your_password';

