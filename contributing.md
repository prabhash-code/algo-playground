# Contribution Guidelines

Please ensure your pull request adheres to the following guidelines:

- First, make sure your code is working properly and pass all the test cases.
- Place it in a proper folder.(Please refer the [folder structure guidelines](#folder-structure-guidelines))
- Create a README.md file describing your question and solution.
  - Keep descriptions short and simple, but descriptive.
  - Solution must be inside a [collapsible section](#collapsible-section-guidelines).
- Check your spelling and grammar.

## Folder Structure Guidelines
1. Typical folder structure should be like below
```
├── ds
│   ├── arrays
│   │   ├── 1D
│   │   │   ├── easy
│   │   │   │   ├── question
│   │   │   │   │   ├── Solution.java
│   │   │   │   │   ├── README.md
│   │   │   ├── medium
│   │   │   │   ├── ...
│   │   │   ├── hard
│   │   │   │   ├── ...
│   │   ├── 2D
│   │   │   ├── ...
│   ├── linked lists
│   ├── stacks
│   ├── ...
├── algo
│   ├── ...
├── contributing.md
└── README.md
```
2. The first level we divided Data Structures and Algorithms separately. Here is few supported data structures but not limited to
   - Arrays 
   - Linked Lists
   - Stacks
   - Queues
   - Trees
   - Graphs
   - Heap 
   - Trie
3. Each data structure may have further subcategories(Ex: Queue -> Priority Queue, Double Ended Queue)
4. Finally, comes the difficulty level(easy, medium and hard) and question
   - Every question must contain `Solution.java` and `README.md` files.

## Collapsible Section Guidelines

```
# A collapsible section with markdown
<details>
  <summary>Click here to expand the solution</summary>

## Heading
1. A numbered
2. list
    * With some
    * Sub bullets
</details>
```

Two important rules:
1. Make sure you have an **empty line** after the closing `</summary>` tag, otherwise the markdown/code blocks won't show correctly.
2. Make sure you have an **empty line** after the closing `</details>` tag if you have multiple collapsible sections.
