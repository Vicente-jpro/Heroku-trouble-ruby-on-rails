Edite the file.
EDITOR="code --wait" bin/rails credentials:edit


How to use variables:
Rails.application.credentials.redis_url
# => "redis://localhost:6379"

Rails.application.credentials.some_api_key
# => "abc123"

Rails.application.credentials.dig(:aws, :access_key_id)
# => "YOUR_KEY"
