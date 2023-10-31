import { sidebar } from "vuepress-theme-hope";

export default sidebar({
  "/": [
    "",
    {
      text: "Android",
      icon: "/cb.svg",
      prefix: "cb/",
      link: "cb/",
      children: "structure",
    },
  ],
});
