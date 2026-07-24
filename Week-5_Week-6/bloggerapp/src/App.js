import React from "react";

function App() {
  const blogs = [
    {
      id: 1,
      title: "React Basics",
      author: "John",
    },
    {
      id: 2,
      title: "Understanding JSX",
      author: "Steve",
    },
    {
      id: 3,
      title: "React Hooks",
      author: "Alice",
    },
  ];

  return (
    <div style={{ padding: "20px" }}>
      <h2>Blogger App</h2>

      {blogs.map((blog) => (
        <div
          key={blog.id}
          style={{
            border: "1px solid black",
            padding: "10px",
            marginBottom: "10px",
          }}
        >
          <h3>{blog.title}</h3>
          <p>Author: {blog.author}</p>
        </div>
      ))}
    </div>
  );
}

export default App;