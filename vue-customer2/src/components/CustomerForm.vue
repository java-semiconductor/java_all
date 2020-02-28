<template>
  <div>
    <v-form>
      <v-container>
        <v-row>
          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="firstname"
              :counter="10"
              label="First name"
              required
            />
          </v-col>

          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="lastname"
              :counter="10"
              label="Last name"
              required
            />
          </v-col>

          <v-col
            cols="12"
            md="4"
          >
            <v-text-field
              v-model="status"
              label="Status"
              required
            />
          </v-col>
        </v-row>
      </v-container>
    </v-form>
    <v-btn @click="submit()">
      Submit
    </v-btn>
  </div>
</template>

<script>
  export default {
      data() {
          return {
              firstname: '',
              lastname: '',
              status: ''
          }
      },
      methods: {
          submit() {
                  fetch('http://localhost:8083/restapi/api/customer', {
                    headers: { 'Content-Type': 'application/json'},
                    method: 'POST',
                    body: JSON.stringify({'firstName': this.firstname, 'lastName': this.lastname, 'status': this.status}) }
                  )          
      },
    }
  }
</script>

