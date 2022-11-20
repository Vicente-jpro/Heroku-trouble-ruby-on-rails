################ Remove redis-server ########################
# if you use apt-get to install redis then use
sudo apt-get purge --auto-remove redis-server

# if you compiled redis manually then follow the
# steps below to remove it completely from linux/ubuntu
sudo service redis_version stop

# Now delete everything related to Redis server from /usr/local/bin/
sudo rm /usr/local/bin/redis-*

# Now delete Redis Configuration files directory and it’s content.
sudo rm -r /etc/redis/

# Delete existing Redis log files.
sudo rm /var/log/redis_*

# Delete existing Redis data directory and it’s content.
sudo rm -r /var/lib/redis/

# Delete existing Redis server init scripts
sudo rm /etc/init.d/redis_*

# Remove existing Redis PID files (Only if exists)
sudo rm /var/run/redis_*​
##############################################################
