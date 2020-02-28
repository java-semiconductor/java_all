<template>
  <v-data-table
    :headers="headers"
    :items="items"
    :items-per-page="5"
    class="elevation-1"
  />
</template>

<script>
  export default {
    data () {
      return {
        headers: [
          { text: 'First Name', value: 'firstName' },
          { text: 'Last Name', value: 'lastName' },
          { text: 'Status', value: 'status' },
        ],
        items: [],
      }
    },
    created () {
    fetch('http://localhost:8083/restapi/api/customer').then(response => response.json()).then(data => {
      this.items = JSON.parse(JSON.stringify(data))
    })
  }
  }
</script>

<style lang="scss" scoped>

</style>