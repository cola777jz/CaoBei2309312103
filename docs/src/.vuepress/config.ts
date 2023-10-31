import { defineUserConfig } from "vuepress";
import theme from "./theme.js";

export default defineUserConfig({
  base: "/",

  lang: "zh-CN",
  title: "Just so so",
  description: "cb & cbq",

  theme,

  // Enable it with pwa
  // shouldPrefetch: false,
});
