show-values:
	helm show values .

encrypt:
	sops --encrypt --age $$(cat recipients.txt) values.yaml > values.yaml.enc

.ONESHELL:

decrypt:
	export SOPS_AGE_KEY_FILE=$$(pwd)/key.age
	helm secrets dec values.yaml.enc

view:
	export SOPS_AGE_KEY_FILE=$$(pwd)/key.age
	helm secrets view values.yaml.enc

template:
	helm template . -f secrets+age-import://$$(pwd)/key.age?values.yaml.enc