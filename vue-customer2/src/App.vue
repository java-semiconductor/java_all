<template>
  <v-app>
    <v-container fluid>
      <v-row>
        <v-col
          cols="12"
          sm="12"
          md="6"
          xl="6"
        >
          <CustomerTable />
        </v-col>
        <v-col
          cols="12"
          sm="12"
          md="6"
          xl="6"
        >
          <CustomerForm />
        </v-col>
      </v-row>
    </v-container>
  </v-app>
</template>

<script>
import CustomerForm from '@/components/CustomerForm.vue';
import CustomerTable from '@/components/CustomerTable.vue';

export default {
  components: {
    CustomerForm,
    CustomerTable
  },
}

</script>

<style lang="scss" scoped>
</style>
