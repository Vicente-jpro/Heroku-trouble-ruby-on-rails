# Heroku-trouble
Some links to solve problems about deployment
 
### Create new rails application with bootstrap
```bash
rails new app4 -j esbuild --css bootstrap
```


### Stop rails server
```bash
kill -9 $(pidof ruby)
# OR
kill $(lsof -t -i:3000)
```

### Run rails project in production
```bash
rails s -e production
```

### Error: Asset 'application.css' was not declared to be precompiled in production
<a href="https://github.com/rails/sprockets-rails/issues/458"> See the in this link</a>
Just run this command into your terminar
```bash
rake tmp:clear
```
### Update ruby version in Rails project 
Into the file `.ruby-version` change the old version `3.x.x` to `4.y.y.y`. <br/>
Go into the `Gemfile` change ruby version `ruby "3.x.x"` to `ruby "3.y.y"`. <br/>
Then execute the command:
```bash
bundle update --bundler
```


### 1 Backend, 5 Frontends - Todo List with Rails, React, Angular, Vue, Svelte, and jQuery
<pre>
https://dev.to/alexmercedcoder/1-backend-5-frontends-todo-list-with-rails-react-angular-vue-svelte-and-jquery-18kp
</pre>

### Documentation
<ul>
 <li> <a href="https://github.com/sdogruyol/awesome-ruby"> Awesome Ruby </a> </li>
 <li> <a href="https://github.com/gramantin/awesome-rails"> Awesome Rails </a> </li>
 <li> <a href="https://www.digitalocean.com/community/tutorials/build-a-restful-json-api-with-rails-5-part-one"> Rails tutorial as API + Rspec </a>  </li>
</ul>


### HTML Templates Theme 
<ol>
 <li> <a href="https://themeforest.net/"> themeforest.net </a> </li>
 <li> <a href="https://startbootstrap.com/"> startbootstrap.com  </a> </li>
</ol>

### Build web sites or modify. 
<a href="https://pt.wix.com/"> Wix </a>
<br/>

### Create installer of any web app

<a href="https://github.com/nativefier/nativefier"> Nativefier </a>
<br/>

