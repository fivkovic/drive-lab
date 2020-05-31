<template>
  <div class="home text-center">
    <img alt="DriveLab logo" src="../assets/logo.png">
    <Welcome msg="Welcome"/>
  </div>
</template>

<script>
// @ is an alias to /src
import Welcome from '@/components/Welcome.vue'

export default {
  name: 'Home',
  components: {
    Welcome
  }
}
</script>
