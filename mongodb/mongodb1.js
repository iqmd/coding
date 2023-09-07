/*
db.articles.insertMany([{
        ArticelID: "001",
        Content: "Welcome to the documentation site for the Java Driver, the official MongoDB driver for synchronous Java applications. Download it using Maven or Gradle, or set up a runnable project by following our Quick Start guide."
    },
    {
        ArticelID: "002",
        Content: "In previous examples, the fields used in indexes had single values stored in them, like a height, a year, or a name. In these cases, MongoDB stored the field value directly as the index key, making the index quickly traversable. This step outlines how MongoDB behaves when the field used to create the index is a field storing multiple values, such as an array."
    }

])

db.articles.createIndex({
    "Content": "text"
})
*/
db.events.insertMany([{
    "Events": "e1",
    "Date": new Date()
}, {
    "Events": "e2",
    "Date": new Date()
}, {
    "Events": "e3",
    "Date": new Date()
}, {
    "Events": "e4",
    "Date": new Date()
}, {
    "Events": "e5",
    "Date": new Date()
}, {
    "Events": "e6",
    "Date": new Date()
}, {
    "Events": "e7",
    "Date": new Date()
}, {
    "Events": "e8",
    "Date": new Date()
}, {
    "Events": "e9",
    "Date": new Date()
}, {
    "Events": "e10",
    "Date": new Date()
}])