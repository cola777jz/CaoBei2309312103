import { navbar } from "vuepress-theme-hope";

export default navbar([
  "/",
  {
    text: "Android",
    icon: "/cb.svg",
    prefix: "/cb",
    children: [
        "",
      { text: "开发环境的安装", icon: "/doc.svg", link: "/init-path.md" },
      { text: "Android 基础界面编程", icon: "/doc.svg", link: "/basic.md" },
      { text: "Android 高级界面控件", icon: "/doc.svg", link: "/advanced.md" },
      { text: "列表控件", icon: "/doc.svg", link: "/list.md" }
    ],
  },
]);
