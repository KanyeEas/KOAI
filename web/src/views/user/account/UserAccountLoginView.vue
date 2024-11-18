<template>
    <ContentField>
        <div class="row justify-content-md-center">
            <div class="col-3">
                <form @submit.prevent="login">
                    <div class="mb-3">
                        <label for="username" class="form-label">User Name</label>
                        <input v-model="username" type="text" class="form-control" id="username" placeholder="Please, Input User Name">
                    </div>
                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input v-model="password" type="text" class="form-control" id="password" placeholder="Please, Input Password">
                    </div>
                    <div class="error-message">{{ error_message }}</div>
                    <button type="submit" class="btn btn-primary">Login In</button>
                </form>
            </div>
        </div>
    </ContentField>
</template>

<script>
import ContentField from '@/components/ContentField.vue';
import { useStore } from 'vuex';
import { ref } from 'vue';
import router from '@/router';

export default {
    components: {
        ContentField
    },
    setup() {
        const store = useStore();
        let username = ref('');
        let password = ref('');
        let error_message = ref('');

        const login = () => {
            error_message.value = '';
            store.dispatch("login", {
                username: username.value,
                password: password.value,
                success(resp) {
                    console.log(resp);
                    store.dispatch("getinfo", {
                        success() {
                            router.push({ name: 'home' });
                            console.log(store.state.username);
                        },
                        error(resp) {
                            console.log(resp);
                        }
                    })
                },
                error(resp) {
                    console.log(resp);
                    error_message.value = 'Wrong password';
                },
            })
        }

        return {
            username,
            password,
            error_message,
            login,
        }
    }
}
</script>

<style scoped>
button {
    width: 100%;
}
div.error-message {
    color: red;
    display: flex;
    justify-content: center;
    margin-bottom: 10px;
}
</style>