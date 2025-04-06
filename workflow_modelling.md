# 1. User Registration
'
flowchart TD
    subgraph User
        A1([Start]) --> A2["Enter registration details"]
        A2 --> A3["Submit registration"]
    end

    subgraph System
        A3 --> A4["Validate input"]
        A4 -->|Valid| A5["Create user account"]
        A4 -->|Invalid| A6["Display error"]
        A5 --> A7["Send verification email"]
        A7 --> A8["Wait for email verification"]
        A8 -->|Verified| A9["Activate account"] --> A10([End])
        A8 -->|Expired| A11["Link expired"] --> A10
        A6 --> A10
    end
