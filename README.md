# Retrofit Example in Kotlin Android App
- This app shows the use of Retrofit - Network Calls
- How to create Retrofit Instance - Singleton
  - Use lazy to insure that only one instance of retrofit will be used - no duplication
- How to call multiple services
- Koltin Coroutine
- synchronized lock is used to safe from multi threading

## APP Structure
- Manifest - Add Internet Permission
- QuoteList - Data class for Response while GET Service through retrofit
- Result - Object used in QuoteList because in Json it's have list so we create its data class and pass as list object in QuoteList Data Class
- QuotesAPI - This is service interface where all functions declare these function is suspend function
  - Suspend function
      - is simply a function that can be paused and resumed at a later time. They can execute a long running operation and wait for it to complete without blocking. The syntax of a suspending function is similar to that of a regular function except for the addition of the suspend keyword.
- RetrofitHelper - Create Retrofit Instance and set the Service using Lazy
- MainActivity - is activity where retrofit instance create with service and get data in global scope coroutines because of suspend function which only called in coroutine

# For any query
  - contact with me through nzdeveloper009@gmail.com
