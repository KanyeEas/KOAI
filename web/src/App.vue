<template>
  <NavBar />
  <router-view/>
</template>

<script>
// import NavBar from '@components/NavBar.vue'
import NavBar from './components/NavBar.vue'
import "bootstrap/dist/css/bootstrap.min.css"
import "bootstrap/dist/js/bootstrap"
// import $ from 'jquery'

export default {
  components: {
    NavBar
  },
  setup() {
    // $.ajax({
    //   url: "http://localhost:3000/user/account/token/",
    //   type: "post",
    //   contentType: "application/json", // 设置Content-Type为application/json
    //   data: JSON.stringify({
    //     username: 'test2',
    //     password: 'test2'
    //   }), // 将数据转换为JSON字符串
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });

    // $.ajax({
    //   url: "http://localhost:3000/user/account/info/",
    //   type: "get",
    //   headers: {
    //     Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI5ODY2NWRiOGQ5YjA0MTY4YTkxY2U5NzI3N2ZiMzU0MSIsInN1YiI6IjIiLCJpc3MiOiJzZyIsImlhdCI6MTczMTI0NTk1MCwiZXhwIjoxNzMyNDU1NTUwfQ.2ihQM_0Cf6ifTFp8NR3e9UHo34bccsjCziNEP1iEQ-I",
    //     // Authorization: "Bearer " + "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOiIxMjM0NTY3ODkwIiwibmFtZSI6IkpvaG4gRG9lIiwiaWF0IjoxNTE2MjM5MDIyfQ.SflKxwRJSMeKKF2QT4fwpMeJf36POk6yJV_adQssw5c",
    //     // Authorization: "Bearer " + "456.123.789",
    //   },
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });

    // $.ajax({
    //   url: "http://localhost:3000/user/account/register/",
    //   type: "post",
    //   contentType: "application/json", // 设置Content-Type为application/json
    //   data: JSON.stringify({
    //     username: 'api_add1',
    //     password: 'api_add1',
    //     confirmedPassword: 'api_add1',
    //   }), // 将数据转换为JSON字符串
    //   success(resp) {
    //     console.log(resp);
    //   },
    //   error(resp) {
    //     console.log(resp);
    //   }
    // });
  }
}
</script>

<style>
body {
  background-image: url("@/assets/images/cool-background.png");
  background-size: cover;
}
</style>
