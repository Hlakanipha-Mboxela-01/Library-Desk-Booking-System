#  Reflection on Modeling Challenges

##  1. Finding the Right Level of Detail

One of the trickiest parts of creating these activity diagrams was figuring out how detailed each step should be. At first, I was including every tiny action, like “Click button” or “Page loads,” which made the diagrams feel messy and overwhelming. But if I skipped too much, I’d miss important parts of the workflow.

**How I solved it:**  
I found a middle ground by grouping smaller steps into more meaningful actions. For example, instead of showing every button click, I just used "Submit feedback." This made the diagrams easier to understand while still capturing the full process. It also made them more useful for everyone whether technical or not.

---

##  2. Connecting Diagrams to Agile Work

Trying to link each diagram back to our user stories and sprint tasks was another challenge. Some stories were broad and touched multiple workflows (like booking, canceling, and checking in), while some sprint tasks were very technical and didn’t easily show up in a diagram.

**How I solved it:**  
I focused each diagram on one key user goal or feature. That way, it was easier to trace how each diagram connected to specific stories and tasks, even if they overlapped. This made the system feel more organized and helped with clarity during development.

---

##  3. State Diagrams vs. Activity Diagrams

| What’s Being Shown | State Diagrams                            | Activity Diagrams                        |
|---------------------|--------------------------------------------|------------------------------------------|
| **Focus**           | How one object changes over time           | Step-by-step flow of a full process      |
| **Best Used For**   | Showing the life cycle of something (like a booking) | Explaining how a task gets done          |
| **Who Uses It**     | Developers and architects                  | End users, product owners, QA teams      |

**My takeaway:**  
Both types of diagrams are useful but in different ways. State diagrams helped me understand how the system works behind the scenes for example, how a desk booking moves from “Pending” to “Approved” to “Checked-In.” On the other hand, activity diagrams helped show the actual workflows users follow, like checking in or submitting feedback. Using both gave me a more complete picture of how the system works from both the inside and the outside.
