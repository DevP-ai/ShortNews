package com.compose.utilities


/*
The code snippet you provided defines a sealed class called
ResourceState<T>, which is a common pattern used in Android development for
representing the various states that can be associated with fetching and processing
data from a remote source or performing other asynchronous operations.
 */

/*
ResourceState<T>: This is the sealed class itself, parameterized by a generic type T.
The generic type T is used to indicate the type of data that the resource state is associated with.
 */
sealed class ResourceState<T> {

    /*
    Loading<T>: This is an inner class extending ResourceState<T>.
    It represents the state when the data is still being loaded or processed.
    The use of generics allows this class to be associated with any type of data.
     */
    class Loading<T> : ResourceState<T>()

    /*
    Success<T>: This is another inner class extending ResourceState<T>.
    It represents the state when the data has been successfully loaded or processed.
    It contains a data property of type T, indicating the successful result.
     */
    data class Success<T>(val data: T) : ResourceState<T>()

    /*
    Error<T>: Similar to Success<T>, this is an inner class extending ResourceState<T>.
    It represents the state when an error occurs during the data loading or processing.
    It contains an error property of type T, indicating the details of the error.
     */
    data class Error<T>(val error: T) : ResourceState<T>()
}
