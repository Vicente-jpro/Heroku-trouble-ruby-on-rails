How To: Add :confirmable to Users
https://github.com/heartcombo/devise/wiki/How-To%3A-Add-%3Aconfirmable-to-Users


Devise Bootstrap Views
https://github.com/hisea/devise-bootstrap-views

Twitter Bootstrap for Rails 6, 5 and 4 Asset Pipeline
https://github.com/seyhunak/twitter-bootstrap-rails

undefined method `users_url' for #<Devise::RegistrationsController:0x00000005018470>
https://github.com/heartcombo/devise/issues/5439

devise_token_auth 1.1.0 installation fails with "undefined method 'devise' for User" #1276
https://github.com/lynndylanhurley/devise_token_auth/issues/1276


CAN NOT LOGOUT
In config/initializer add this line
config.sign_out_via = :get

In route add this line
 devise_for :users, controllers: {registrations: "registrations"}

  devise_scope :user do
    post '/users/sign_out', to: 'devise/sessions#destroy'
  end
