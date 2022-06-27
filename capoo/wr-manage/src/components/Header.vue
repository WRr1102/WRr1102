<template>
<div style="
          font-size: 12px;
          line-height: 60px;
          display: flex;">
  <div style="flex: 1; font-size: 18px">
          <span
              :class="collapseBtnClass"
              style="cursor: pointer"
              @click="collapse"
          ></span>
      <el-breadcrumb separator="/" style="display:inline-block; margin-left: 10px">
        <el-breadcrumb-item :to="'/'">首页</el-breadcrumb-item>
        <el-breadcrumb-item >{{currentPathName}}</el-breadcrumb-item>
      </el-breadcrumb>
  </div>
  <el-dropdown style="width: 70px">
          <span style="margin-right: 5px; cursor: pointer">勿扰扰</span
          ><i class="el-icon-arrow-down"></i>
    <el-dropdown-menu slot="dropdown">
      <el-dropdown-item>
        <router-link to="/person"  style="color: black; text-decoration: none">个人信息</router-link>
      </el-dropdown-item>
      <el-dropdown-item><span to="/login" style="color: black; text-decoration: none" @click="logout">退出</span></el-dropdown-item>
    </el-dropdown-menu>
  </el-dropdown>
</div>
</template>

<script>
export default {
  name: "Header",
  props: {
    collapseBtnClass:String,
    collapse:'',
  },
  computed: {
    currentPathName () {
      return this.$store.state.currentPathName;
    }
  },
  watch: {
    currentPathName(newVal, oldVal) {
      console.log(newVal)
    }
  },
  methods: {
    logout() {
      this.$router.push("/login")
      localStorage.removeItem("user")
      this.$message.success("退出成功")
    }
  }
}
</script>

<style scoped>

</style>