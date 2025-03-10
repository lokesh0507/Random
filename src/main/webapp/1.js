// 1.js
async function fetchRandomQuote() {
    const response = await fetch('/random-quote');
    const quote = await response.text();
    document.getElementById('quote').innerText = quote;
}

async function searchQuote() {
    const author = document.getElementById('author').value;
    const response = await fetch(`/search-quote?author=${author}`);
    const results = await response.text();
    document.getElementById('search-results').innerHTML = results;
}/**
 * 
 */