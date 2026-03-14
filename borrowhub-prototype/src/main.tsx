
  import { createRoot } from "react-dom/client";
  import App from "./app/App.tsx";
  import "./styles/index.css";
  import logo from "./assets/logo.png";

  // System Initialization with Branding
  const favicon = document.createElement("link");
  favicon.rel = "icon";
  favicon.type = "image/png";
  favicon.href = logo;
  document.head.appendChild(favicon);

  console.log("%cBorrowHub MIS Initialized", "color: #DC143C; font-weight: bold; font-size: 1.2rem;");

  createRoot(document.getElementById("root")!).render(<App />);
  