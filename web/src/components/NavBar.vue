<template>
<nav class="navbar navbar-expand-lg bg-body-tertiary">
  <div class="container-fluid">
    <router-link class="navbar-brand" :to="{name: 'home'}">King of AI</router-link>
    <div class="collapse navbar-collapse" id="navbarText">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <router-link :class="route_name == 'pk_index' ? 'nav-link active' : 'nav-link'" aria-current="page" :to="{name: 'pk_index'}">AI_PK</router-link>
        </li>
        <li class="nav-item">
          <router-link :class="route_name == 'record_index' ? 'nav-link active' : 'nav-link'" :to="{name: 'record_index'}">对局列表</router-link>
        </li>
        <li class="nav-item">
          <router-link :class="route_name == 'ranklist_index' ? 'nav-link active' : 'nav-link'" :to="{name: 'ranklist_index'}">排行榜</router-link>
        </li>
      </ul>
      <ul class="navbar-nav">
        <li class="nav-item dropdown">
          <router-link class="nav-link dropdown-toggle" role="button" data-bs-toggle="dropdown" aria-expanded="false" :to="{name: 'user_bot_index'}">
            User Name
          </router-link>
          <ul class="dropdown-menu">
            <li><router-link class="dropdown-item" :to="{name: 'user_bot_index'}">My Bots</router-link></li>
            <li><router-link class="dropdown-item" :to="{name: 'user_bot_index'}">Log out</router-link></li>
          </ul>
        </li>
      </ul>
    </div>
  </div>
</nav>
</template>

<script>
import { useRoute } from 'vue-router';
import { computed } from 'vue';

export default {
  setup() {
    const route = useRoute();
    let route_name = computed(() => route.name)
    return {
      route_name
    }
  }
}
</script>

<style scoped>

</style>