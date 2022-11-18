# Retrofit Example in Kotlin Android App
- This app shows the use of Retrofit - Network Calls
- How to create Retrofit Instance - Singleton
  - Use lazy to insure that only one instance of retrofit will be used - no duplication
- How to call service GET
- Koltin Coroutine
- synchronized lock is used to safe from multi threading

## APP Structure
- Manifest - Add Internet Permission
- QuoteList - Data class for Response while GET Service through retrofit
- Result - Object used in QuoteList because in Json it's have list so we create its data class and pass as list object in QuoteList Data Class
- QuotesAPI - This is interface where all Services by declare suspense function
- RetrofitHelper - Create Retrofit Instance and set the Service using Lazy
- MainActivity - is activity where retrofit instance create with service and get data in global scope coroutines because of suspense function which only called in coroutine
