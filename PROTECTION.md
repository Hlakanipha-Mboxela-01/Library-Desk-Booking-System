# PROTECTION 

##  Branch Protection Rules for `main`

To ensure code quality, security, and collaboration best practices, the following protection rules have been applied to the `main` branch of the **Library Desk Booking System** repository:

###  Enforced Rules

- **Require pull request reviews before merging**
  - At least **1 approving review** is required.
  - This prevents unreviewed code from being merged into production.
  
- **Require status checks to pass before merging**
  - The CI pipeline (`CI Pipeline / build`) must pass all automated tests.
  - This ensures that only verified code gets merged.

- **Require branches to be up to date before merging**
  - This ensures that the PR branch includes the latest changes from `main`, reducing merge conflicts and integration issues.

- **Restrict direct pushes**
  - Developers cannot push directly to `main`.
  - All changes must go through a pull request and review process.

---

##  Why These Rules Matter

### 1. **Quality Control**
- Ensures no code is merged without proper testing and approval.
- Reduces the risk of bugs and production downtime.

### 2. **Accountability**
- Every change is traceable to a pull request, reviewer, and CI run.
- Promotes team collaboration and transparency.

### 3. **Industry Standards**
- Most tech companies follow this approach using GitHub Actions or similar CI/CD tools.
- Adhering to these standards improves project maintainability and team workflows.

---

## Screenshot of Protection Rules

![Image](https://github.com/user-attachments/assets/cf93e80f-d82b-4ea6-b273-f048caa5d0a4)

![Image](https://github.com/user-attachments/assets/25c67431-06fa-4b88-976b-5da15c0affdd)

![Image](https://github.com/user-attachments/assets/be9f645a-6580-4ca4-8aa0-9b49975ddcb2)


