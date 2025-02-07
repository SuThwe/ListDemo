<!DOCTYPE html>
<html>
<head>
</head>
<body>
<h1>ListDemo - Android App</h1>
<p>A simple and clean Android application demonstrating the implementation of a <b>RecyclerView</b> to display a list of data. 
This project is designed to showcase proficiency in <b>Kotlin</b>, <b>MVVM architecture</b>, and related Android technologies for interview purposes.</p>

<h2>Features</h2>
<ul>
<li><b>RecyclerView with Adapter</b>: Dynamically displays a list of items using <code>RecyclerView</code> and a custom <code>Adapter</code>.</li>
<li><b>MVVM Architecture</b>: Follows the Model-View-ViewModel design pattern for scalability and maintainability.</li>
<li><b>Fragments</b>: Implements reusable UI components using <code>Fragment</code>.</li>
<li><b>Retrofit Integration</b>: Fetches data from a REST API using <code>Retrofit</code>.</li>
<li><b>Coroutines</b>: Handles asynchronous tasks (e.g., API calls) efficiently using Kotlin Coroutines.</li>
</ul>

<h2>Technologies Used</h2>
<ul>
<li><b>Language</b>: Kotlin</li>
<li><b>UI Components</b>: RecyclerView, Fragments</li>
<li><b>Architecture</b>: MVVM</li>
<li><b>Networking</b>: Retrofit</li>
<li><b>Concurrency</b>: Kotlin Coroutines</li>
</ul>

<h2>Project Structure</h2>
<pre>
ListDemo/
├── data/
│   ├── model/              # Data models (e.g., Item data class)
│   ├── network/            # Retrofit API service
│   └── repository/         # Repository for data management
├── ui/
│   ├── adapter/            # RecyclerView adapter
│   ├── view/               # Fragments and UI components
│   └── viewmodel/          # ViewModels
├── utils/                  # Utility classes (e.g., constants, helpers)
└── MainActivity.kt         # Host activity
</pre>

<h2>Screens</h2>
<p>
<i><b>Main Screen</b> - Displays the list of items fetched from the API.</i><br>
<i><b>Item screen</b> - Displays the clicked item text. </i>
</p>

<h2>Setup and Installation</h2>
<h3>Prerequisites</h3>
<ul>
<li>Android Studio Flamingo or higher.</li>
<li>A device or emulator running Android 5.0 (API Level 21) or above.</li>
</ul>

<h3>Steps to Run the Project</h3>
<ol>
<li>Clone the repository:
  <pre><code>git clone https://github.com/SuThwe/ListDemo.git</code></pre>
</li>
<li>Open the project in <b>Android Studio</b>.</li>
<li>Sync Gradle and resolve dependencies.</li>
<li>Build and run the app on an emulator or physical device.</li>
</ol>

<h2>How It Works</h2>

<h3>Data Flow</h3>
<ol>
<li><b>Retrofit</b> fetches data from the API.</li>
<li>Data is passed to the <b>Repository</b>, which serves as the single source of truth.</li>
<li>The <b>ViewModel</b> observes the repository and provides data to the <b>Fragment</b>.</li>
<li>The <b>RecyclerView Adapter</b> binds the data to the UI.</li>
</ol>

<h2>API Integration</h2>
<p><b>Retrofit</b> is used to fetch data from a REST API. The Base URL and endpoints are configured in the <code>ApiService</code>.</p>

<h2>Key Learnings</h2>
<ul>
<li>Implementing <code>RecyclerView</code> with an Adapter for efficient list rendering.</li>
<li>Managing lifecycle-aware components with ViewModel.</li>
<li>Handling API calls and threading with Coroutines.</li>
<li>Structuring projects for modularity and maintainability using MVVM.</li>
</ul>

<h2>Contributing</h2>
<p>Feel free to fork this repository and contribute by submitting pull requests. For major changes, please open an issue first to discuss what you would like to change.</p>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <a href="LICENSE">LICENSE</a> file for details.</p>

<h2>Contact</h2>
<p>For any questions or suggestions:</p>
<ul>
<li><b>Author</b>: <a href="https://github.com/SuThwe">Su Tun</a></li>
<li><b>Email</b>: <a href="mailto:example@domain.com">suthwethwetun@gmail.com</a></li>
</ul>

<h2>Tips for Using This Repository in Interviews</h2>
<ul>
<li>Highlight the clean architecture and modular design.</li>
<li>Discuss how you’ve implemented API integration using Retrofit.</li>
<li>Emphasize the efficient use of Coroutines for asynchronous tasks.</li>
<li>Showcase the adaptability of the project for larger, more complex use cases.</li>
</ul>

</body>
</html>
